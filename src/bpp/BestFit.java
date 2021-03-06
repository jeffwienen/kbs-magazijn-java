package bpp;

import java.util.ArrayList;

public class BestFit {

    private Depository depository;
    private BoxDepository boxd;
    private ArrayList<Product> producten;
    private ArrayList<Box> arrayBox;
    private Product p;
    private MySQLbpp bpp = new MySQLbpp();
    private int time;

    public void setBoxDepository(BoxDepository b) {
        this.boxd = b;
        this.arrayBox = boxd.getList();
    }

    public void setDepository(Depository b) {
        this.depository = b;
        this.producten = depository.getList();
    }

    public Depository getDepository() {
        return this.depository;
    }

    public void BF(int idorder) {
        // controleren op order
        int boxnr = 0;
        int sizeproduct = 0;
        int productnr = 0;
        int sizeorder = depository.GetSizeOrder();
        int sizebox = 0;

        while (sizeorder > 0) {
            int sizeb;
            int covered;
            String status;
            int nrProduct;

            if (sizeorder > 0) {
                sizeb = 20;
            } else {
                sizeb = 0;
            }
           
            // nieuwe box maken in database
            boxnr = bpp.NewBox(sizeb, idorder);
            // nieuwe box maken in arraylist
            Box box = new Box(boxnr, sizeb, 0, idorder, "busy");
            arrayBox.add(box);
            sizebox = sizeb;
            status = box.getStatus();

            // grootste product opvragen en productnr erbij zoeken  
            sizeproduct = depository.GetBigProduct();

            // arraylist bij product en productnr opvragen.
            nrProduct = depository.GetProductWithSize(sizeproduct);
            p = producten.get(nrProduct);
            productnr = p.GetidProduct();

            // boxnr aanpassen in arraylist
            p.SetBox(boxnr);

            // boxnr bij product aanpassen in database
            bpp.SetBox(boxnr, productnr);
            // boxcovered wordt aangepast in de arraylist
            covered = box.getCovered();
            box.setCovered(covered + sizeproduct);

            sizeorder = sizeorder - sizeproduct;
            sizebox = sizebox - sizeproduct;
            System.out.println("ProductId: " + productnr + " Size: " + sizeproduct + " was added");
            System.out.println("Sizebox :" + sizebox + " Sizeorder : " + sizeorder + "\n");

            int sProduct;

            // kijk of er nog een product is die in de overgebleven ruimte past 
            sProduct = depository.GetSmallProduct(sizebox);

            while (sizebox >= sProduct && sizeorder > 0 && sProduct != 0) {
                if (sProduct != 0) {

                    // grootste product opvragen en productnr erbij zoeken  
                    sizeproduct = depository.GetSmallProduct(sizebox);

                    // arraylist bij product en productnr opvragen.
                    nrProduct = depository.GetProductWithSize(sizeproduct);
                    p = producten.get(nrProduct);
                    productnr = p.GetidProduct();

                    // boxnr aanpassen in arraylist
                    p.SetBox(boxnr);

                    // boxnr bij product aanpassen in database
                    bpp.SetBox(boxnr, productnr);

                    // boxcovered wordt aangepast in de arraylist
                    covered = box.getCovered();
                    box.setCovered(covered + sizeproduct);

                    sizeorder = sizeorder - sizeproduct;
                    sizebox = sizebox - sizeproduct;
                    System.out.println("ProductId: " + productnr + " Size: " + sProduct + " was added");
                    System.out.println("Sizebox :" + sizebox + " Sizeorder : " + sizeorder + "\n");
                }
                sProduct = depository.GetSmallProduct(sizebox);
            }
            int c = (covered + sizeproduct);
            // doos is zo vol mogelijk doos word gesloten database
            bpp.updateBox(c, true, boxnr);

            // doos word gesloten in arraylist
            box.setStatus("ready");
            System.out.println("Box" + boxnr + " was closed");
        }
    }
}
