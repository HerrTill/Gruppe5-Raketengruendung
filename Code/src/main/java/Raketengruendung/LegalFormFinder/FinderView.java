package Raketengruendung.LegalFormFinder;
public interface FinderView {
    interface onClickStart {
        void execute();
    }
    interface onClickMainmenu {
        void execute();
    }

    void setOnClickStart(onClickStart callback);
    void setOnClickMainmenu(onClickMainmenu callback);

    void setTitleText(String titleText);
    void setStartText(String startText);
    void setMainmenuText(String mainmenuText);
    void setPictureNotFoundText(String pictureNotFoundText);
}