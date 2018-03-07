class Main
{
	public static void main ( String args[])
	{
		Pessoa p1 = new Pessoa ("Ana", 18);		
		Pessoa p2 = new Pessoa("Joao", 15);

		

		System.out.println("Nome: "+p1.getNome()+"\nidade: "+p1.getIdade()+"\n ");
		System.out.println("Nome: "+p2.getNome()+"\nIdade: "+p2.getIdade());
	}
}
