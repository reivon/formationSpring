package fr.reivon.formation.spring14;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class MachineLearningTest {

    //DI
    @Resource
    DataModelService mll;

    @Test
    public void test_ml_always_return_true() {

        //assert correct type/impl
        assertThat(mll, instanceOf(MachineLearningService.class));

        //assert true
        assertThat(mll.isValid(""), is(true));

    }
}