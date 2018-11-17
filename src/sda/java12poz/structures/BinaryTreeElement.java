package sda.java12poz.structures;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class BinaryTreeElement {
    private BinaryTreeElement leftElement = null;
    private BinaryTreeElement rightElement = null;
    private Integer data;

    public BinaryTreeElement(Integer data) {
        this.data = data;
    }

    public BinaryTreeElement(BinaryTreeElement leftElement, Integer data, BinaryTreeElement rightElement) {
        this.leftElement = leftElement;
        this.rightElement = rightElement;
        this.data = data;
    }

    public static BinaryTreeElement exampleTree() {
        BinaryTreeElement root = new BinaryTreeElement(
                new BinaryTreeElement(
                        new BinaryTreeElement(
                                new BinaryTreeElement(8),
                                5,
                                new BinaryTreeElement(1)
                        ),
                        11,
                        new BinaryTreeElement(
                                new BinaryTreeElement(9),
                                2,
                                new BinaryTreeElement(5)
                        )
                ),
                12,
                new BinaryTreeElement(
                        new BinaryTreeElement(20),
                        4,
                        new BinaryTreeElement(7)
                        )
        );
        return root;
    }

    public int heightOfTree() {
        /**
         *  jeżeli leftElement != null
         *      leftHeight = leftElement.heightOfTree();
         *  jeżeli rightElement != null
         * 	    rightHeight = rightElement.heightOfTree();
         * 	return max(leftHeight , rightHeight) + 1
         */
        int leftHeight = (leftElement == null) ? 0 : leftElement.heightOfTree();
        int rightHeight = (rightElement == null) ? 0 : rightElement.heightOfTree();

        return Integer.max(leftHeight, rightHeight) + 1;
    }

    public void printPreOrdered(){
        /**
         * 	wypisz wierzchołek_v.wartość
         * 	jeżeli wierzchołek_v.lewy_syn != null to
         * 		PRE-ORDER(wierzchołek_v.lewy_syn)
         * 	jeżeli wierzchołek_v.prawy_syn != null to
         * 		PRE-ORDER(wierzchołek_v.prawy_syn)
         * }
         */

        System.out.print(data + " ");

        if (leftElement != null) {
            leftElement.printPreOrdered();
        }
        if (rightElement != null) {
            rightElement.printPreOrdered();
        }
    }

    public MyList<Integer> getPreOrderedList(){
        MyList<Integer> preOrderedList = new MyList<>();
        this.addToPreOrderedList(preOrderedList);
        return preOrderedList;
    }

    private void addToPreOrderedList(MyList<Integer> preOrderedList) {
        preOrderedList.append(data);
        if (leftElement != null) leftElement.addToPreOrderedList(preOrderedList);
        if (rightElement != null) rightElement.addToPreOrderedList(preOrderedList);
    }

    public MyList<Integer> getInOrderedList(){
        MyList<Integer> inOrderedList = new MyList<>();
        this.addToInOrderedList(inOrderedList);
        return inOrderedList;
    }

    private void addToInOrderedList(MyList<Integer> inOrderedList) {
        if (leftElement != null) leftElement.addToInOrderedList(inOrderedList);
        inOrderedList.append(data);
        if (rightElement != null) rightElement.addToInOrderedList(inOrderedList);
    }

    public MyList<Integer> getPostOrderedList(){
        MyList<Integer> postOrderedList = new MyList<>();
        this.addToPostOrderedList(postOrderedList);
        return postOrderedList;
    }

    private void addToPostOrderedList(MyList<Integer> postOrderedList) {
        if (leftElement != null) leftElement.addToPostOrderedList(postOrderedList);
        if (rightElement != null) rightElement.addToPostOrderedList(postOrderedList);
        postOrderedList.append(data);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ ").append(data);
        if (leftElement != null) {
            stringBuilder.append(", left=").append(leftElement);
        }
        if (rightElement != null) {
            stringBuilder.append(", right=").append(rightElement);
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public String toSimpleJSON(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ \"data\": ").append(data);
        if (leftElement != null) stringBuilder.append(", \"left\": ").append(leftElement.toSimpleJSON());
        if (rightElement != null) stringBuilder.append(", \"right\": ").append(rightElement.toSimpleJSON());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toFormattedJSON(){
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        try {
            engine.eval("function toJSON(obj){ return JSON.stringify(JSON.parse(obj),null,4) };");
            Invocable scriptFunction = (Invocable) engine;
            String formattedJSON = scriptFunction.invokeFunction("toJSON", toSimpleJSON()).toString();
            return formattedJSON.replaceAll("\"", "");
        } catch (ScriptException | NoSuchMethodException e) {
            return "";
        }
    }

    public BinaryTreeElement getLeftElement() {
        return leftElement;
    }

    public void setLeftElement(BinaryTreeElement leftElement) {
        this.leftElement = leftElement;
    }

    public BinaryTreeElement getRightElement() {
        return rightElement;
    }

    public void setRightElement(BinaryTreeElement rightElement) {
        this.rightElement = rightElement;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
