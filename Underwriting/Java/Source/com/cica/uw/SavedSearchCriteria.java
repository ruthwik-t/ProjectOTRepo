/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;

public class SavedSearchCriteria extends SavedSearchCriteriaBase
{
    public SavedSearchCriteria()
    {
        this((BusObjectConfig)null);
    }

    public SavedSearchCriteria(BusObjectConfig config)
    {
        super(config);
    }
public static BusObjectIterator<com.cica.uw.SavedSearchCriteria> savedCriteriaObjsForOrgUser(String orgDN, String UserDN,String SearchName)
    {
        
        String queryText = "";         

        if((!SearchName.equalsIgnoreCase(""))&&(!SearchName.equalsIgnoreCase("*")))
          queryText = "select * from \"SavedSearchCriteria\" where \"UserId\"=:UserId and OrgDn=:OrgDn and  UPPER(SearchName) like UPPER('%"+SearchName+"%') order by SearchName";
        else queryText = "select * from \"SavedSearchCriteria\" where \"UserId\"=:UserId and OrgDn=:OrgDn  order by SearchName";

        QueryObject query = new QueryObject(queryText);
        query.addParameter("UserId", "SavedSearchCriteria.UserId", QueryObject.PARAM_STRING, UserDN);
        query.addParameter("OrgDn", "SavedSearchCriteria.OrgDn", QueryObject.PARAM_STRING,orgDN);
        query.setResultClass(SavedSearchCriteria.class);
        return query.getObjects();
       
    }

}