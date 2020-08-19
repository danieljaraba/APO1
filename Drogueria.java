import java.util.Scanner;
public class Drogueria{
	
		public static void main (String[] args){
			
			Scanner lector= new Scanner(System.in);
			
			System.out.println("Ingrese Contado, si el pago se realizo al contado o ingrese Credito, si se realizo con tarjeta.");
			
			String pago = lector.next();
			
			System.out.println("Ingrese el dia que se realiza la compra.");
			
			int dia = lector.nextInt();
			
			System.out.println("Ingrese el ultimo digito de la cedula del comprador.");
			
			int cedula = lector.nextInt();
			
			System.out.println("Ingrese el valor total de la compra.");
			
			double valorCompra = lector.nextDouble();
			
			double descuento;
			
			String visualizarDescuento;
			
			double valorFinal;
			
			if (pago.equals("Contado")){
				
				descuento = 0.05;
				
				valorFinal = valorCompra*(1-descuento);
				
				visualizarDescuento = "descuento";
				
				System.out.println("El valor total de su compra fue: " + valorFinal + " con un " + visualizarDescuento + " de " + descuento + ".");
				
			}
			
			else if (pago.equals("Credito")){
				
				descuento = 0.03;
				
				valorFinal = valorCompra*(1+descuento);
				
				visualizarDescuento = "recargo";
				
				System.out.println("El valor total de su compra fue: " + valorFinal + " con un " + visualizarDescuento + " de " + descuento + ".");
				
			}
			
			int par = cedula % 2;
			
			String premio = " ";
			
			switch (dia){
				
				case 6:
				
					if (par == 0)
						System.out.println("Usted gano una botella de te de durazno.");
					
					else
						System.out.println("Usted gano una coca cola 750ml.");
					
				break;
					
				case 9:
					
					System.out.println("Usted gano un descuento del 9% sobre el valor de la siguiente compra.");
					
				break;
					
				case 24:
				
					if (par == 0)
						System.out.println("Usted gano un gel antibacterial.");
					
					else
						System.out.println("Usted gano un sobre de dolex.");
					
				break;
				
			}
			
			
		}
	
	
}

