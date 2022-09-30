package aula29_09;
public class Calculadora {
    //soma
        public double operacao(double num1,double num2){
           return num1+num2;
        }        
    //menos
        public double operacao(int num1,double num2){
            return num1 - num2;
        }
    //dividir    
        public double operacao(int num1,int num2){        
            return num1/2;
        }
    //produto    
        public double operacao(double num1,int num2){ 
            if (num1 != 0 ||num2 !=0){
            return num1*num2;
            }
            else{
                return 0;
            }
        }    
    //Resto da divisão    
        public double operacao(double num1,short num2){        
        return num1%num2;
        }    
 }    
        
