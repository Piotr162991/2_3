class Main {
  public static void main(String[] args) {
    
    
    char[] oceny = new char[] {4.0, 3.0};
    double suma=0.0;
    int ilosć = oceny.length;
     for (int i = 0 ; i < oceny.length() ; i++)   
      {
         suma+=oceny[i];
  }
    return suma;
}
}