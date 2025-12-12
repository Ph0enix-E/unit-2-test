public class KillCilantro {
public static String killCilantro(String string) {
int i = 0;
int x = 0;
int y = 0;
int  n = 0;
String killCilantro = string;
while (i + 7 < string.length()) {
if (string.substring(i, i + 8).equals("cilantro")) {
x = i;
y = i + 8;
killCilantro = killCilantro.substring(0, x - n) + "parsley" + killCilantro.substring(y - n);
n += 1;
}
i += 1;
}
if (y > 0) {

}
return killCilantro;
}


//I know the code is weird but it works
public static void main(String[] args) {
System.out.println(killCilantro("Acilantrobbcilantrobcdefgcilantrohijcilantrouuuucilantro"));
System.out.println(killCilantro("cccilantrcilantrro"));
}
}