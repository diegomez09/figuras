package figuritas;

public class Cuadrado implements figurita{

	private double lado;	 	
	
	public Cuadrado(double lado2)
	{
		this.setLado(lado2);
	}

	@Override
	public double area()
	{
		return Math.pow(this.getLado(), 2);
	}
	
	@Override
	public double perimetro()
	{
		return this.getLado() * 4;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}
	
}
