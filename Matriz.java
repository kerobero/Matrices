import javax.swing.JOptionPane;
    
/**
*
* @author Juan Pablo Castrillón
* 
*/
    
public class Matriz {
    
    private int  [][] matriz;
    private int f=-1;
    private int c=-1;
    
   /**
    * Constructor por defecto
    */
    
    public Matriz(){
        matriz = new int[2][2];
        System.out.println("Creada Matriz por defecto "+matriz.length+"x"+matriz[0].length);
    }
    
    /**
     * Constructor que recibe dos parametros como tamaño de la matriz
     * 
     * @param x Filas de la matriz
     * @param y Columnas de la matriz
     */
    
    public Matriz (int x,int y) {
        matriz = new int [x][y];
        System.out.println("Creada Matriz "+matriz.length+"x"+matriz[0].length);
    }
    
    /**
     * Método que nos llena la matriz
     */
    
    public void LlenarMatriz(){
        try {
            for (f=0; f<matriz.length;f++)
                for (c=0; c<matriz[0].length;c++)
                    matriz[f][c]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a ingresar"));
        } catch(Exception e){}
    }
    
    /**
     * Método que averigua si una matriz es simetrica o no
     * @return
     */
    
    public boolean MatrizCuadrada(){
        if(matriz.length==matriz[0].length)
            return true;
        else
            return false;        
    }
    
    public void MostrarMatriz(){
        if(!MatrizVacia()){
            for (int i=0; i<matriz.length;i++){
                for (int j=0; j<matriz[0].length;j++)
                    System.out.print(matriz[i][j]+" ");
                System.out.println();
            }
        }
        else
            System.out.println("La matriz esta vacía");
    }
    
    /**
     * Método booleano, devuelve true si la matriz esta llena
     * @return
     */
    
    public boolean MatrizLLena(){
        if(f==matriz.length-1&&c==matriz.length-1)
            return true;
        else
            return false;
    }
    
    /**
     * Método booleano, devuelve true si la matriz esta vacía.
     * @return
     */
    
    public boolean MatrizVacia(){
        if (f==-1&&c==-1)
            return true;
        else
            return false;
    }
    
    /**
     * Método que imprime la Diagonal Principal
     */
    
    public void DiagonalPrincipal(){
        System.out.println("Diagonal Principal");
        if(MatrizCuadrada()&&!MatrizVacia()){
            for (int i=0; i<matriz.length;i++)
                System.out.print(matriz[i][i]+" ");
            System.out.println();
        }
        else
            if (MatrizVacia())
                System.out.println("La matriz esta vacia.");
            else
                System.out.println("La matriz no es cuadrada, por lo tanto no tiene diagonal principal");
    }
    
    /**
     * Método que imprime la transpuesta de una matriz cualquiera.
     */
    
    public void Transpuesta(){
        System.out.println("Transpuesta");
        for (int i=0;i<matriz[0].length;i++){
            for (int j=0;j<matriz.length;j++)
                System.out.print(matriz[j][i]+" ");
            System.out.println();
        }
    }
    
    /**
     * Método booleano, devuelve true si la matriz es simétrica
     * @return
     */
    
    public boolean Simetrica(){
        boolean sw=true;
        if(MatrizCuadrada()){
            for (int i=0;i<matriz.length;i++){
                for (int j=0;j<matriz[0].length;j++){
                    if(!(matriz[i][j]==matriz[j][i]))
                        sw=false;
                }
            }
            if (sw)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}