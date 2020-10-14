package com.hll.design._07composite;

/**
 * @author linglong.he
 * @date 2020-08-28 10:32
 **/
public class Test {


    public static void main(String[] args) {
        AbstractCompnent abstractCompnent = new CompositeCompnent("root");
        AbstractCompnent abstractCompnent1 = new CompositeCompnent("c1");
        AbstractCompnent abstractCompnent2 = new CompositeCompnent("c2");
        AbstractCompnent abstractCompnent3 = new LeafCompnent("L1");
        AbstractCompnent abstractCompnent4 = new LeafCompnent("L2");

        abstractCompnent.add(abstractCompnent1);
        abstractCompnent.add(abstractCompnent2);

        abstractCompnent1.add(abstractCompnent3);
        abstractCompnent1.add(abstractCompnent4);

        printTree(abstractCompnent,0);



    }

    private static void printTree(AbstractCompnent abstractCompnent,int deep) {
        for(int i=0;i<deep;i++)
            System.out.print("-");
        abstractCompnent.opr();
        if(!abstractCompnent.isLeaf()){
            CompositeCompnent c = (CompositeCompnent)abstractCompnent;
            deep ++;
            for(AbstractCompnent c1 : c.getChild()){
                printTree(c1,deep);
            }
        }

    }
}
