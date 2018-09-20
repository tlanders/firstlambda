package biz.lci.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaMatrixRequestHandler implements RequestHandler<LambdaMatrixRequestHandler.MatrixData, String> {
    /**
     * Matrix request handler for AWS Lambda. This method must be passed a string (i.e. "XXX")
     * and not JSON. JSON will fail.
     * @param input
     * @param context
     * @return  A result string based on the input.
     */
    public String handleRequest(MatrixData input, Context context) {
        context.getLogger().log("Input: " + input.name);
        return "Hello Matrix - " + input.name + ", len=" + input.matrix.length;
    }

    public static class MatrixData {
        private int [][] matrix;
        private String name;

        public int[][] getMatrix() {
            return matrix;
        }

        public void setMatrix(int[][] matrix) {
            this.matrix = matrix;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}