import javax.swing.*;

public class UncheckedException{

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira Numerador"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira Denominador"));

        try {
            int resultado = a/b;
            JOptionPane.showMessageDialog(null,"Resultado: "+resultado);
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Entrada Inválida" + nfe.getMessage());
            System.out.println("Valor nao suportado!");
        }catch (ArithmeticException ae){
            JOptionPane.showMessageDialog(null,"Impossivel dividir um numero por zero" + ae.getMessage());
        }
        finally {
            System.out.println("Programa finalizado");
        }
    }
}
