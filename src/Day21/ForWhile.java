package Day21;

public class ForWhile {

    /*String[ ] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji",
    "Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji" };

    Yukarıdaki dizi verildiğine göre;
    Adı Bölümü
    Ahmet Fizi*/
    public static void main(String[] args) {

        String[] data={"Ahmet","Fizik","Şengül","Kimya","Hakan","Matematik","Feraye","Biyoloji",
                "Cengiz","Felsefe","Salih","Elektronik","Sezen","Bilgisayar","Hasan","Fizik","Sezgin","Biyoloji"};

        System.out.println("Adı"+"     Bölümü");
        System.out.println("-".repeat(15));
        for (int i = 0; i < data.length; i+=2) {
            System.out.println(data[i]+ "\t"+ data[i+1]);}
            System.out.println();
            }







        }










