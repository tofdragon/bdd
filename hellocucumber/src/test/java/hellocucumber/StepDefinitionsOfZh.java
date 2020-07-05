package hellocucumber;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.假设;
import io.cucumber.java.zh_cn.当;
import io.cucumber.java.zh_cn.那么;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author sunjing
 */
public class StepDefinitionsOfZh {

    Integer total = 0;

    Integer finish = 0;

    @假设("(.*)我的任务清单里有{int}个任务")
    public void 我的任务清单里有_个任务(Integer total) {
        this.total = total;
    }

    @当("(.*)我完成{int}件任务之后")
    public void 我完成_件任务之后(Integer finish) {
        this.finish = finish;
    }

    @那么("(.*)我还剩下{int}件未完成的任务")
    public void 我还剩下_件未完成的任务(Integer unFinish) {
        Assert.assertTrue(this.total - this.finish == unFinish);
    }

}
