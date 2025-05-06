package DemoQA;

import DemoQA.Interactions.*;
import org.openqa.selenium.By;

import static utilities.JavaScript.scrollToElementJS;

public class InteractionsPage extends HomePage {

    private By sortableMenuItem = By.xpath("//li[@id='item-0']/span[text()='Sortable']");
    private By selectableMenuItem = By.xpath("//li[@id='item-1']/span[text()='Selectable']");
    private By resizableMenuItem = By.xpath("//li[@id='item-2']/span[text()='Resizable']");
    private By droppableMenuItem = By.xpath("//li[@id='item-3']/span[text()='Droppable']");
    private By dragabbleMenuItem = By.xpath("//li[@id='item-4']/span[text()='Dragabble']");

    public SortablePage goToSortable() {
        scrollToElementJS(sortableMenuItem);
        clickElement(sortableMenuItem);
        return new SortablePage();
    }

    public SelectablePage goToSelectable() {
        scrollToElementJS(selectableMenuItem);
        clickElement(selectableMenuItem);
        return new SelectablePage();
    }

    public ResizablePage goToResizable() {
        scrollToElementJS(resizableMenuItem);
        clickElement(resizableMenuItem);
        return new ResizablePage();
    }

    public DroppablePage goToDroppable() {
        scrollToElementJS(droppableMenuItem);
        clickElement(droppableMenuItem);
        return new DroppablePage();
    }

    public DragabblePage goToDragabble() {
        scrollToElementJS(dragabbleMenuItem);
        clickElement(dragabbleMenuItem);
        return new DragabblePage();
    }

}
