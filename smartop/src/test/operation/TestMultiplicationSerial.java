/* 
 *  Copyright 2016 ISISTAN - UNICEN - CONICET
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.operation;

import matrix.factory.FactoryMatrixHolder;
import matrix.factory.FactoryMatrixSparseHash;
import matrix.matrixComp.MatrixComputation;
import matrix.matrixComp.MatrixComputationFD;
import matrix.matrixImpl.Matrix;

/**
 * Class created with tesing purposes
 * @author Anto
 *
 */
public class TestMultiplicationSerial {

	/**
	 * @param args no parameters are needed
	 */
	public static void main(String[] args) {
		
		//setting of the matrix holder
		FactoryMatrixHolder.setFactory(new FactoryMatrixSparseHash());
		
		Matrix A = FactoryMatrixHolder.getFactory().createMatrix("matrixA.csv");
			
		Matrix B = FactoryMatrixHolder.getFactory().createMatrix("matrixB.csv");
		
		MatrixComputation algebraFD = new MatrixComputationFD();
		
		Matrix C = algebraFD.multiply(A, B);
		
		System.out.println(C);
		
	}
	
}
