package staticnonstatic;
public class staticnonstatic {
public int i=9;
public static int j = 8;
public static void main(String[] args) {
    staticnonstatic a = new staticnonstatic();
    System.out.println(a.i); //non-static
    System.out.println(staticnonstatic.j); //static
}
}