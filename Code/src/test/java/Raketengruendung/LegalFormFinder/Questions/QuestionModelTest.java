package Raketengruendung.LegalFormFinder.Questions;

import Raketengruendung.LegalFormFinder.Exceptions.TooManyChildrenException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuestionModelTest {

    @Test
    public void testTooManyChildrenException() throws TooManyChildrenException {
        Question question = new Question("test","test");
        Question questionOverload = new Question("test","test");


        question.addChild(questionOverload);
        question.addChild(questionOverload);
        question.addChild(questionOverload);

        Assertions.assertThrows(TooManyChildrenException.class, () -> question.addChild(questionOverload));

    }

}