/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int iArre[] = new int[50];
        //LLENAR EL ARREGLO
        for (int i = 0; i < iArre.length; i++) {
            iArre[i] = (int) (Math.random() * 100) + 1;
        }
        //IMPRIMIR EL ARREGLO
        for (int i = 0; i < iArre.length; i++) {
            System.out.print("[" + iArre[i] + "] ");
        }
        System.out.println("");

        //CONTADOR DE PARES E IMPARES
        int iContPar = 0;
        int iContImpar = 0;
        for (int i = 0; i < iArre.length; i++) {
            if (iArre[i] % 2 == 0) {/*Si el residuo de dividir a iArre[i] entre 2 
                                    es 0, entonces es un numero par.*/
                iContPar++;
                //System.out.println(iArre[i] + " PAR");
            } else {
                iContImpar++;
                //System.out.println(iArre[i] + " IMPAR");
            }
        }
        //ARREGLO DE PARES
        System.out.println("ARREGLO DE PARES ");
        int iArrePares[] = new int[iContPar];
        int iAux = 0;
        for (int i = 0; i < iArre.length; i++) {
             if (iArre[i] % 2 == 0) {/*Si el residuo de dividir a iArre[i] entre 2 
                                    es 0, entonces es un numero par.*/
                iArrePares[iAux] = iArre[i]; //La variable auxiliar permite indicar
                                             //la posicion en que se va a guardar el numero.
                iAux++;
            }
        }

        //IMPRIMIR EL ARREGLO
        for (int i = 0; i < iArrePares.length; i++) {
            System.out.print("[" + iArrePares[i] + "] ");
        }
        System.out.println("");
        //ARREGLO DE IMPARES
        System.out.println("ARREGLO DE IMPARES ");
        int iArreImpares[] = new int[iContImpar];
        int iAux2 = 0;
        for (int i = 0; i < iArre.length; i++) {
             if (iArre[i] % 2 != 0) {/*Si el residuo de dividir a iArre[i] entre 2 
                                    es 0, entonces es un numero par.*/
                iArreImpares[iAux2] = iArre[i];//La variable auxiliar permite indicar
                                               //la posicion en que se va a guardar el numero.
                iAux2++;
            }
        }

        //IMPRIMIR EL ARREGLO
        for (int i = 0; i < iArreImpares.length; i++) {
            System.out.print("[" + iArreImpares[i] + "] ");
        }
        

    }
}