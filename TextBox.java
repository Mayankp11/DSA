public class TextBox {                                                           //create members of class TextBox
    public String text;                  // String is type of field(text).It is used to store some text

    public void setText(String text){

        this.text= text;                // this is use if parameters and field are same
    }

    public void clear(){
        text = "";
    }


}
