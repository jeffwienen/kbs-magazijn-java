package asrs;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.Element;

/**
 *
 * @author jeffreywienen
 */
public class MainFrame extends javax.swing.JFrame {

    private File file;
    private ArrayList<Order> orders;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        prRefresh.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbUpload = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tOrders = new javax.swing.JTable();
        jbRefresh = new javax.swing.JButton();
        prRefresh = new javax.swing.JProgressBar();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tCurrent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlName = new javax.swing.JLabel();
        jlAddress = new javax.swing.JLabel();
        jbStart = new javax.swing.JButton();
        jbStopProcess = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jlSProgress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AS/RS");
        setFont(new java.awt.Font("Yu Gothic UI Light", 0, 13)); // NOI18N
        setResizable(false);

        jbUpload.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jbUpload.setText("Upload");
        jbUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUploadActionPerformed(evt);
            }
        });

        tOrders.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        tOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ordernr", "Klant", "Datum", "Aantal producten"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tOrders);
        if (tOrders.getColumnModel().getColumnCount() > 0) {
            tOrders.getColumnModel().getColumn(0).setResizable(false);
            tOrders.getColumnModel().getColumn(1).setResizable(false);
            tOrders.getColumnModel().getColumn(2).setResizable(false);
            tOrders.getColumnModel().getColumn(3).setResizable(false);
        }

        jbRefresh.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        jbRefresh.setText("Refresh");
        jbRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRefreshActionPerformed(evt);
            }
        });

        tCurrent.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 11)); // NOI18N
        tCurrent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Artikelnr", "Status", "Beschrijving"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tCurrent);
        if (tCurrent.getColumnModel().getColumnCount() > 0) {
            tCurrent.getColumnModel().getColumn(0).setResizable(false);
            tCurrent.getColumnModel().getColumn(1).setResizable(false);
            tCurrent.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Current process");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Queued orders");

        jLabel3.setFont(new java.awt.Font("YuGothic", 0, 13)); // NOI18N
        jLabel3.setText("Klantgegevens");

        jlName.setFont(new java.awt.Font("YuGothic", 0, 13)); // NOI18N
        jlName.setText("Naam:");

        jlAddress.setFont(new java.awt.Font("YuGothic", 0, 13)); // NOI18N
        jlAddress.setText("Ordernr:");

        jbStart.setBackground(new java.awt.Color(102, 255, 51));
        jbStart.setText("Start");
        jbStart.setContentAreaFilled(false);
        jbStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartActionPerformed(evt);
            }
        });

        jbStopProcess.setText("Stop process");
        jbStopProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStopProcessActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");

        jlSProgress.setFont(new java.awt.Font("YuGothic", 0, 13)); // NOI18N
        jlSProgress.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jlName)
                            .addComponent(jlAddress)
                            .addComponent(jlSProgress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbStopProcess))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbRefresh)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbUpload))
                                    .addComponent(jButton1)))
                            .addComponent(jLabel1))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(prRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbStart)
                        .addComponent(jbStopProcess))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAddress)
                        .addGap(45, 45, 45)
                        .addComponent(jlSProgress)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbRefresh)
                            .addComponent(jbUpload))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(prRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void isLoading(boolean loading){
        if (loading) {
            prRefresh.setVisible(true);
            prRefresh.setIndeterminate(true); 
        }else{
            prRefresh.setVisible(false);
        }
    }
    private void refreshContent(boolean hard){
        DefaultTableModel model = (DefaultTableModel) tOrders.getModel();
        model.setRowCount(0);
        
        if(hard){
            MySQL mysql = new MySQL();
            this.orders = mysql.fetchOrders();
        }
        for(int i=0; this.orders.size()>i; i++){
            int data1 = this.orders.get(i).getOrdernr();
            String data2 = this.orders.get(i).getC().getFirstName() + " " + this.orders.get(i).getC().getLastName();
            Date data3 = this.orders.get(i).getDate();
            int data4 = this.orders.get(i).getProducts().size();
            
            Object[] data = {data1,data2,data3,data4};
            model.insertRow(model.getRowCount(), data);
        }
    }
    private void updateContent(Order order) {
        
        ArrayList<String> next = new ArrayList<String>();
        DefaultTableModel model = (DefaultTableModel) tOrders.getModel();
        model.setRowCount(tOrders.getModel().getRowCount());
        int data1 = order.getOrdernr();
        String data2 = order.getC().getFirstName() + " " + order.getC().getLastName();
        Date data3 = order.getDate();
        int data4 = order.getProducts().size();  
        Object[] rowData = {data1, data2, data3, data4};
        model.insertRow(model.getRowCount(), rowData);
        this.orders.add(order);
    }
    private void uploadXML(){
        Upload up = new Upload(this);
        up.setVisible(true);

        if (up.isUploaded()) {
            try {
                isLoading(true);
                Customer customer = new Customer();

                File file = up.getXml();
                DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                Document doc = dBuilder.parse(file);
                //Get customer info
                NodeList cList = doc.getElementsByTagName("klant");
                for (int temp = 0; temp < cList.getLength(); temp++) {
                    Node cNode = cList.item(temp);

                    if (cNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) cNode;
                        customer.setFirstName(eElement.getElementsByTagName("voornaam").item(0).getTextContent());
                        customer.setLastName(eElement.getElementsByTagName("achternaam").item(0).getTextContent());
                        customer.setAddress(eElement.getElementsByTagName("adres").item(0).getTextContent());
                        customer.setCity(eElement.getElementsByTagName("plaats").item(0).getTextContent());
                        customer.setZipcode(eElement.getElementsByTagName("postcode").item(0).getTextContent());

                    }
                }
                Order order = new Order(Integer.parseInt(doc.getElementsByTagName("ordernummer").item(0).getTextContent()), customer);
                
                //Date convert
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date date = formatter.parse(doc.getElementsByTagName("datum").item(0).getTextContent());
                java.sql.Date sql = new java.sql.Date(date.getTime());
                order.setDate(sql);
                

                // Loop all products 
                NodeList nList = doc.getElementsByTagName("artikelnr");
                for (int temp = 0; temp < nList.getLength(); temp++) {
                    Node nNode = nList.item(temp);
                    Product product = new Product();
                    product.setId(Integer.parseInt(doc.getElementsByTagName("artikelnr").item(temp).getTextContent()));
                    order.addProduct(product);
                }
                order.addToQueue();
                updateContent(order);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private void jbUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUploadActionPerformed
        // TODO add your handling code here:
        SwingWorker<Void, Void> xml = new SwingWorker<Void, Void>(){
            @Override
            protected Void doInBackground() throws Exception{
                uploadXML();
                isLoading(false);
                return null;
            }            
        };
        xml.execute();        
    }//GEN-LAST:event_jbUploadActionPerformed
    private void jbRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRefreshActionPerformed
        // TODO add your handling code here:
        SwingWorker<Void, Void> refresh = new SwingWorker<Void, Void>(){
            @Override
            protected Void doInBackground() throws Exception{
                isLoading(true);
                refreshContent(true);
                isLoading(false);
                return null;
            }            
        };
        refresh.execute();
    }//GEN-LAST:event_jbRefreshActionPerformed

    private void jbStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        SwingWorker<Void, Void> start = new SwingWorker<Void, Void>(){
            @Override
            protected Void doInBackground() throws Exception{
                Order current = orders.get(0);

                current.setState(Order.State.IN_PROGRESS);
                orders.remove(0);
                refreshContent(false);
                jlName.setText("Naam: " + current.getC().getFirstName() + " " + current.getC().getLastName());
                jlAddress.setText("Ordernr: " + current.getOrdernr() );
                
                
                
                DefaultTableModel model = (DefaultTableModel) tCurrent.getModel();
                model.setRowCount(0);
                
                for(int i=0; current.getProducts().size()> i; i++){
                    int ordernr     = current.getProducts().get(i).getId();
                    String status   = current.getProducts().get(i).getStatus();
                    Object[] data = {ordernr, status};
                    model.insertRow(model.getRowCount(), data);
                }
                
                //START TSP========================
                //
                //
                
                while(current.getState() == Order.State.IN_PROGRESS){
                    for(Product prod : current.getProducts()){
                        System.out.println("Product: " + prod.getId() + " in behandeling" );
                        prod.setStatus("Opgepakt");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException ie) {
                            //Handle exception
                        }
                    }
                    
                    
                    System.out.println("FIN");
                }
                return null;
            }
        };
        
        start.execute();
    }//GEN-LAST:event_jbStartActionPerformed

    private void jbStopProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStopProcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbStopProcessActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbRefresh;
    private javax.swing.JButton jbStart;
    private javax.swing.JButton jbStopProcess;
    private javax.swing.JButton jbUpload;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlSProgress;
    private javax.swing.JProgressBar prRefresh;
    private javax.swing.JTable tCurrent;
    private javax.swing.JTable tOrders;
    // End of variables declaration//GEN-END:variables
}
