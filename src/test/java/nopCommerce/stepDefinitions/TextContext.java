package nopCommerce.stepDefinitions;

public class TextContext {
    public DataContext dataContext;
    public TextContext(){
        dataContext = new DataContext();
    }
    // để mỗi khi gọi getDataContext, đã new 1 lần ở trên rồi, không new lại
    public DataContext getDataContext(){
        return dataContext;
    }
}
