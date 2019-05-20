public class cobaaja {
    public static void main(String[] args) {
        String[] musik = { "Jazz", "Samba", "Dixie", "Fusion" };
        
        String[] aliranJazz = musik.clone();
        
        System.out.print("musik: ");
        tampilkanArray(musik);
        
        System.out.print("aliranJazz: ");
        tampilkanArray(aliranJazz);
        
        aliranJazz[1] = "Bepop";

        System.out.println("Setelah ada perubahan:");
        System.out.print("musik: ");
        tampilkanArray(musik);
        
        System.out.print("aliranJazz: ");
        tampilkanArray(aliranJazz);
    }

    public static void tampilkanArray(String[] x) {
        System.out.print("{" + x[0]);
        for (int i = 1; i < x.length; i++)
            System.out.print(", " + x[i]);
        
        System.out.println('}');
    }

}
