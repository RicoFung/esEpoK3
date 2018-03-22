/**
  * Copyright 2018 bejson.com 
  */
package com.api.entity.singlesave;
import java.util.List;

/**
 * Auto-generated: 2018-03-22 17:22:35
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class FOutStockTrace {

    private String FEntryID;
    private FLogComId FLogComId;
    private String FCarryBillNo;
    private String FTraceStatus;
    private List<FOutStockTraceDetail> FOutStockTraceDetail;
    public void setFEntryID(String FEntryID) {
         this.FEntryID = FEntryID;
     }
     public String getFEntryID() {
         return FEntryID;
     }

    public void setFLogComId(FLogComId FLogComId) {
         this.FLogComId = FLogComId;
     }
     public FLogComId getFLogComId() {
         return FLogComId;
     }

    public void setFCarryBillNo(String FCarryBillNo) {
         this.FCarryBillNo = FCarryBillNo;
     }
     public String getFCarryBillNo() {
         return FCarryBillNo;
     }

    public void setFTraceStatus(String FTraceStatus) {
         this.FTraceStatus = FTraceStatus;
     }
     public String getFTraceStatus() {
         return FTraceStatus;
     }

    public void setFOutStockTraceDetail(List<FOutStockTraceDetail> FOutStockTraceDetail) {
         this.FOutStockTraceDetail = FOutStockTraceDetail;
     }
     public List<FOutStockTraceDetail> getFOutStockTraceDetail() {
         return FOutStockTraceDetail;
     }

}