package org.exemple;

import org.example.Matrix;
import org.junit.jupiter.api.*;

public class MatrixTest {
    private Matrix matrix1 ;
    private Matrix matrix2 ;

    @BeforeEach
    public void setup()
    {
        matrix1 = new Matrix(2);
    }
    @Test
    public void MatrixToStringtest(){
        matrix1.set(0,1,2);
        matrix1.set(0,0,1);
        matrix1.set(1,0,3);
        matrix1.set(1,1,4);

       System.out.println( matrix1.toString() );
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " : " + j + " -> "  +  matrix1.get(i,j));
            }
        }
    }

    @Test
    public void MatrixSet()     // la verification effectuer visualement
    {
        matrix1.set(1,1,5) ;

        System.out.println(matrix1.toString());
    }
    @Test
    public void MatrixGet(){
        matrix1.set(1,1,5) ;

        System.out.println(matrix1.toString());

        int result = matrix1.get(1,1);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void MatrixAdd(){
        matrix2 = new Matrix(2) ;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2.set(i,j,1);
                matrix1.set(i,j,1) ;
            }
        }

        matrix1.add(matrix2);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
              Assertions.assertEquals(2,matrix1.get(i,j));
            }
        }
    }
    @Test
    public void MatrixAddMatrixNull(){
        matrix2 = null ;
        matrix1.add(matrix2);
    }
    @Test
    public void MatrixAddDeffSize(){
        matrix2 = new Matrix(4) ;
        matrix1.add(matrix2);
    }
    @Test
    public void MatrixMultiplyMatrixNull(){
        matrix2 = null ;
        matrix1.multiply(matrix2);
    }
    @Test
    public void MatrixMultiplyDeffSize(){
        matrix2 = new Matrix(4) ;
        matrix1.multiply(matrix2);
    }
    @Test
    public void MatrixMultiply(){
        matrix2 = new Matrix(2) ;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1.set(i,j,1) ;
            }
        }

        matrix1.multiply(matrix2);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Assertions.assertEquals(0,matrix1.get(i,j));
            }
        }
    }
    @Test
    public void MatrixTranspose(){
        matrix1.set(0,1,2);
        matrix1.set(1,0,5);

        int result0_1Before  = matrix1.get(0,1) ;
        int result1_0Before  = matrix1.get(1,0) ;

        matrix1.transpose();

        int result0_1After  = matrix1.get(0,1) ;
        int result1_0After  = matrix1.get(1,0) ;

        Assertions.assertEquals(result0_1Before , result1_0After);
        Assertions.assertEquals(result1_0Before , result0_1After);

    }

}
