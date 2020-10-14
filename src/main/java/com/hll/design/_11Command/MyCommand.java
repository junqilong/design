package com.hll.design._11Command;

/**
 * @author linglong.he
 * @date 2020-09-03 10:22
 **/
public class MyCommand {

}

/**
 * 命令接受者
 */
class Receiver{
    void doSome(){
        System.out.println("执行具体任务");
    }
}

/**
 * 命令角色
 */
interface Command{
    void exec();
    void undo();
}

/**
 * 具体命令
 */
class MyCommond implements Command{

    private  Receiver receiver;

    public MyCommond(Receiver receiver){
        this.receiver = receiver;
    }

    public void exec() {
        receiver.doSome();
    }

    public void undo() {

    }
}

/**
 * 命令调用者
 */
class Invoke{
    private Command commond;

    public Invoke(Command commond){
        this.commond = commond;
    }

    public void action(){
        commond.exec();
    }
}



