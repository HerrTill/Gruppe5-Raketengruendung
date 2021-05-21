package Raketengruendung.Homescreen;


public interface HomescreenView{
    interface onClickNewFoundings {
        void execute();
    }
    interface onClickCurrentFoundings {
        void execute();
    }
    interface onClickFinishedFoundings {
        void execute();
    }
    interface onClickFinder {
        void execute();
    }

    interface onLanguage {
        void execute();
    }

    void setOnLanguageSwitch(onLanguage callback);
    void setOnClickFinder(onClickFinder callback);
    void setOnClickNewFounding(onClickNewFoundings callback);
    void setOnClickCurrentFoundings(onClickCurrentFoundings callback);
    void setOnClickFinishedFoundings(onClickFinishedFoundings callback);

    void setWelcomeText(String welcomeText);
    void setFinderInformationText(String finderInformationText);
    void setFinderText(String finderButtonText);
    void setNewFoundingInformationText(String newFoundingInformationText);
    void setNewFoundingText(String newFoundingText);
    void setCurrentFoundingInformationText(String currentFoundingInformationText);
    void setCurrentFoundingText(String currentFoundingText);
    void setFinishedFoundingInformationText(String finishedFoundingInformationText);
    void setFinishedFoundingText(String finishedFoundingText);
    void setLanguageSwitchText(String languageSwitchText);
}
