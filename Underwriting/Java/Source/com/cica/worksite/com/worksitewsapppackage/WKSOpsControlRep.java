/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;


public class WKSOpsControlRep extends WKSOpsControlRepBase
{
    public WKSOpsControlRep()
    {
        this((BusObjectConfig)null);
    }

    public WKSOpsControlRep(BusObjectConfig config)
    {
        super(config);
    }

    public static void DeleteTodaysReport(String deleteDate)
    {
        // TODO implement body
		String queryText = "delete from WKSOpsControlRep where Created_Date = :deleteDate";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("deleteDate", "WKSOpsControlRep.deleteDate", QueryObject.PARAM_STRING, deleteDate);
        query.setResultClass(WKSOpsControlRep.class);
        query.execute();

    }

}