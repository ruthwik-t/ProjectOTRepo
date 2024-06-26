/*
  This class has been generated by the Code Generator
*/

package com.cmwsappserverpackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;

public class POLJRULE extends POLJRULEBase
{
    public POLJRULE()
    {
        this((BusObjectConfig)null);
    }

    public POLJRULE(BusObjectConfig config)
    {
        super(config);
    }

    public static BusObjectIterator<com.cmwsappserverpackage.POLJRULE> getAllRecordsForPolicy(String POLICY)
    {
    //String queryText = "select * from TEMPOP.POLJRULE where POLICY='"+POLICY+"'";
     String queryText = "select * from CCMCIPDTA.POLJRULE where POLICY='"+POLICY+"'";  //query updated req by Nagaraju
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(POLJRULE.class);
        return query.getObjects();
    }

}