package fr.reivon.formation.spring15;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
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