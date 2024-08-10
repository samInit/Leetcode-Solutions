class Solution {

    public int regionsBySlashes(String[] grid) {
        int gridSize = grid.length;
        int totalTriangles = gridSize * gridSize * 4;
        int[] parentArray = new int[totalTriangles];
        Arrays.fill(parentArray, -1);

     
        int regionCount = totalTriangles;

        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
              
                if (row > 0) {
                    regionCount -=
                    unionTriangles(
                        parentArray,
                        getTriangleIndex(gridSize, row - 1, col, 2),
                        getTriangleIndex(gridSize, row, col, 0)
                    );
                }
               
                if (col > 0) {
                    regionCount -=
                    unionTriangles(
                        parentArray,
                        getTriangleIndex(gridSize, row, col - 1, 1),
                        getTriangleIndex(gridSize, row, col, 3)
                    );
                }

               
                if (grid[row].charAt(col) != '/') {
                    regionCount -=
                    unionTriangles(
                        parentArray,
                        getTriangleIndex(gridSize, row, col, 0),
                        getTriangleIndex(gridSize, row, col, 1)
                    );
                    regionCount -=
                    unionTriangles(
                        parentArray,
                        getTriangleIndex(gridSize, row, col, 2),
                        getTriangleIndex(gridSize, row, col, 3)
                    );
                }

                
                if (grid[row].charAt(col) != '\\') {
                    regionCount -=
                    unionTriangles(
                        parentArray,
                        getTriangleIndex(gridSize, row, col, 0),
                        getTriangleIndex(gridSize, row, col, 3)
                    );
                    regionCount -=
                    unionTriangles(
                        parentArray,
                        getTriangleIndex(gridSize, row, col, 2),
                        getTriangleIndex(gridSize, row, col, 1)
                    );
                }
            }
        }
        return regionCount;
    }

    private int getTriangleIndex(
        int gridSize,
        int row,
        int col,
        int triangleNum
    ) {
        return (gridSize * row + col) * 4 + triangleNum;
    }

  
    private int unionTriangles(int[] parentArray, int x, int y) {
        int parentX = findParent(parentArray, x);
        int parentY = findParent(parentArray, y);

        if (parentX != parentY) {
            parentArray[parentX] = parentY;
            return 1; 
        }

        return 0;
    }

    
    private int findParent(int[] parentArray, int x) {
        if (parentArray[x] == -1) return x;

        return parentArray[x] = findParent(parentArray, parentArray[x]);
    }
}