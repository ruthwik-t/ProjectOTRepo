/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;

public class tblPostIssueDetails_worksheet extends tblPostIssueDetails_worksheetBase
{
    public tblPostIssueDetails_worksheet()
    {
        this((BusObjectConfig)null);
    }

    public tblPostIssueDetails_worksheet(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.cica.uw.tblPostIssueDetails_worksheet> gettblPostIssueDetailsWorksheetUsingCaseID(String CaseID)
    {
 QueryObject query;
			String queryText="select * FROM tblPostIssueDetails_worksheet where case_id = :CaseID order by obj_id asc";
			query=new QueryObject(queryText);
			query.addParameter("CaseID", "tblPostIssueDetails_worksheet.case_id",QueryObject.PARAM_STRING, CaseID);
        
    query.setResultClass(tblPostIssueDetails_worksheet.class);
 return query.getObjects();

    }

}