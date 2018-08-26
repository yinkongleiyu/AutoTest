package testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void Test1(){
        System.out.println("这是服务端组的测试方法1");
    }

    @Test(groups = "server")
    public void Test2(){
        System.out.println("这是服务端组的测试方法2");
    }

    @Test(groups = "client")
    public void Test3(){
        System.out.println("这是客户端组的测试方法3");
    }

    @Test(groups = "client")
    public void Test4(){
        System.out.println("这是客户端组的测试方法4");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void AfterGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void AfterGroupsOnClient(){
        System.out.println("这是服务端组运行之前运行的方法");
    }
}
