public class Main{
    public static void main(String[] args){
        try{
            UsersDAO usersDAO = new UsersDAOImpl();
            Users objUser = usersDAO.getUserDetails("cdac");
            System.out.println(objUser.getName());
            System.out.println(objUser.getEmail());
        }catch(UsersException e){
            e.printStackTrace();
        }
    }
}
