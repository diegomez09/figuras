package figuritas;

public class Cubo implements figurita{

	private double lado;
	
	public Cubo(double lado)
	{
		this.setLado(lado);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public double area()
	{
		return 6 * (Math.pow(this.getLado(), 2));
	}
	@Override
	public double perimetro()
	{
		return 12 * this.getLado();
	}
	
}
