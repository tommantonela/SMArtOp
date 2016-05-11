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
package matrix.factory;

import matrix.matrixImpl.Matrix;
import matrix.matrixImpl.MatrixSparse;
import matrix.matrixImpl.Terna;

/**
 * This class constructs matrices representation given by a HashMap<Terna,float>.
 * The {@link Terna} contains the coordinates of the cell and the matrix number of columns.
 * @see MatrixSparse
 * @author Antonela Tommasel
 *
 */
public class FactoryMatrixSparse implements FactoryMatrix {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Matrix createMatrix(int i, int j){
		return new MatrixSparse(i,j);
	}

	@Override
	public Matrix createMatrix(Matrix toCopy) {
		return new MatrixSparse(toCopy);
	}

	@Override
	public Matrix createIdentity(int rowSize) {
		Matrix identity = new MatrixSparse(rowSize,rowSize);
		for(int i=0;i<rowSize;i++)
			identity.setValue(i, i, 1);
		return identity;
	}
}