public class MinhaClasse {
//Método principal
public static void main (String [] args) {
    String primeiroNome = "Bianca";
    String segundoNome = "Gauna Soares";
//A variável do tipo String "nomeCompleto" equivale ao resultado do método "nomeCompleto()" 
    String nomeCompleto = nomeCopleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);


}

//Método secundário que se chama 'nomeCompleto', aqui os parâmetros do método são (String primeiroNome e String segundoNome)
public static String nomeCopleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);

}
}