import DAO.DAOCity;

public class Main {

    public static String stringX(String str) {

        if(str.length() < 1){
            return str;
        }

        String xStart = "";
        String xEnd = "";

        if(str.substring(0, 1).equals("x")){
            xStart = "x";
        }

        if(str.substring(str.length()-1).equals("x")){
            xEnd = "x";
        }

        String result = (xStart.concat(str.replace("x", "")).concat(xEnd));
        return result;

    }


    public static void main(String[] args) {
        DAOCity dbc = new DAOCity();
        //List<String> arrList = dbc.getList();
        //System.out.println(arrList);

        String paris = dbc.getByName("moscow");
        System.out.println(paris);
//            for (String var : arrList) {
//                System.out.println(stringX(var));
//            }

    }
}
