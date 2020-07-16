public class App {
    public static void main(String[] args) throws Exception {
        String canal =" programador iniciante       ";
        String EnkCanal = "programador junior   ";


      //  canal = canal.trim();
        //canal = canal.toLowerCase();                //transforma em minuscola
        //canal = canal.replaceAll("p","P");
        //canal = canal.replaceFirst("i","I");
        canal = "Aluno ".concat(canal.trim()).toLowerCase().replaceFirst("p","P").replaceFirst("i","I").replaceFirst("a","A");
            
        EnkCanal = "Encadeamente ".concat(EnkCanal.trim()).toLowerCase().replaceFirst("p","P").replaceFirst("j", "J").replaceFirst("e", "E");
        System.out.println("####################");
        System.out.println("[ " + canal + "]" + EnkCanal);
        

        }
   // public static void name(String[] args) {
     //   String Ecanal
        
    }

