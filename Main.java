class Main
{
   public static void main(String args[])
   {  
      Pessoa p1 = new Pessoa();
      p1.setNome("Ana");
      p1.setIdade(18);
      Pessoa p2 = new Pessoa();
      p2.setNome("João");
      p1.setIdade(15);
      System.out.println("Nome1:"+p1.getNome()+"\nIdade:"+p1.getIdade());
      System.out.println(p2.getNome()+p2.getIdade());
      
   }
}
