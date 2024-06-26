/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class WKSFPEligibilityRulesBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_EligibilityID = "EligibilityID";
    public final static String ATTR_Product = "Product";
    public final static String ATTR_MinParticipation = "MinParticipation";
    public final static String ATTR_GroupSize = "GroupSize";
    public final static String ATTR_GIParticipation = "GIParticipation";
    public final static String ATTR_GIAmount = "GIAmount";
    public final static String ATTR_EIAmount = "EIAmount";
    public final static String ATTR_Description = "Description";
    public final static String ATTR_CreatedDate = "CreatedDate";
    public final static String ATTR_ModifiedDate = "ModifiedDate";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(WKSFPEligibilityRules.class);
            s_classInfo.setTableName("WKSFPEligibilityRules");
            s_classInfo.setUIDElements(new String[]{ATTR_EligibilityID});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_EligibilityID);
                ai.setJavaName(ATTR_EligibilityID);
                ai.setColumnName(ATTR_EligibilityID);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_EligibilityID);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Product);
                ai.setJavaName(ATTR_Product);
                ai.setColumnName(ATTR_Product);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Product);
                v.setMaxLength(250);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_MinParticipation);
                ai.setJavaName(ATTR_MinParticipation);
                ai.setColumnName(ATTR_MinParticipation);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_MinParticipation);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_GroupSize);
                ai.setJavaName(ATTR_GroupSize);
                ai.setColumnName(ATTR_GroupSize);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_GroupSize);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_GIParticipation);
                ai.setJavaName(ATTR_GIParticipation);
                ai.setColumnName(ATTR_GIParticipation);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_GIParticipation);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_GIAmount);
                ai.setJavaName(ATTR_GIAmount);
                ai.setColumnName(ATTR_GIAmount);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_GIAmount);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_EIAmount);
                ai.setJavaName(ATTR_EIAmount);
                ai.setColumnName(ATTR_EIAmount);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_EIAmount);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Description);
                ai.setJavaName(ATTR_Description);
                ai.setColumnName(ATTR_Description);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Description);
                v.setMaxLength(500);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CreatedDate);
                ai.setJavaName(ATTR_CreatedDate);
                ai.setColumnName(ATTR_CreatedDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ModifiedDate);
                ai.setJavaName(ATTR_ModifiedDate);
                ai.setColumnName(ATTR_ModifiedDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public WKSFPEligibilityRulesBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getEligibilityID()
    {
        return getIntProperty(ATTR_EligibilityID);
    }

    public void setEligibilityID(int value)
    {
        setProperty(ATTR_EligibilityID, value, 0);
    }

    public String getProduct()
    {
        return getStringProperty(ATTR_Product);
    }

    public void setProduct(String value)
    {
        setProperty(ATTR_Product, value, 0);
    }

    public int getMinParticipation()
    {
        return getIntProperty(ATTR_MinParticipation);
    }

    public void setMinParticipation(int value)
    {
        setProperty(ATTR_MinParticipation, value, 0);
    }

    public int getGroupSize()
    {
        return getIntProperty(ATTR_GroupSize);
    }

    public void setGroupSize(int value)
    {
        setProperty(ATTR_GroupSize, value, 0);
    }

    public String getGIParticipation()
    {
        return getStringProperty(ATTR_GIParticipation);
    }

    public void setGIParticipation(String value)
    {
        setProperty(ATTR_GIParticipation, value, 0);
    }

    public String getGIAmount()
    {
        return getStringProperty(ATTR_GIAmount);
    }

    public void setGIAmount(String value)
    {
        setProperty(ATTR_GIAmount, value, 0);
    }

    public String getEIAmount()
    {
        return getStringProperty(ATTR_EIAmount);
    }

    public void setEIAmount(String value)
    {
        setProperty(ATTR_EIAmount, value, 0);
    }

    public String getDescription()
    {
        return getStringProperty(ATTR_Description);
    }

    public void setDescription(String value)
    {
        setProperty(ATTR_Description, value, 0);
    }

    public java.util.Date getCreatedDate()
    {
        return getDateTimestampProperty(ATTR_CreatedDate);
    }

    public void setCreatedDate(java.util.Date value)
    {
        setProperty(ATTR_CreatedDate, value, 0);
    }

    public java.util.Date getModifiedDate()
    {
        return getDateTimestampProperty(ATTR_ModifiedDate);
    }

    public void setModifiedDate(java.util.Date value)
    {
        setProperty(ATTR_ModifiedDate, value, 0);
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSFPEligibilityRules> getNextWKSFPEligibilityRulesObjects(int EligibilityID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSFPEligibilityRules\" where (\"EligibilityID\" > :EligibilityID) order by \"EligibilityID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("EligibilityID", "WKSFPEligibilityRules.EligibilityID", QueryObject.PARAM_INT, new Integer(EligibilityID));//NOPMD
        query.setResultClass(WKSFPEligibilityRules.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSFPEligibilityRules> getPreviousWKSFPEligibilityRulesObjects(int EligibilityID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSFPEligibilityRules\" where (\"EligibilityID\" < :EligibilityID) order by \"EligibilityID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("EligibilityID", "WKSFPEligibilityRules.EligibilityID", QueryObject.PARAM_INT, new Integer(EligibilityID));//NOPMD
        query.setResultClass(WKSFPEligibilityRules.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.worksitewsapppackage.WKSFPEligibilityRules getWKSFPEligibilityRulesObject(int EligibilityID)
    {
        String queryText = "select * from \"WKSFPEligibilityRules\" where \"EligibilityID\" = :EligibilityID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("EligibilityID", "WKSFPEligibilityRules.EligibilityID", QueryObject.PARAM_INT, new Integer(EligibilityID));//NOPMD
        query.setResultClass(WKSFPEligibilityRules.class);
        return (WKSFPEligibilityRules)query.getObject();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSFPEligibilityRules> getWKSFPEligibilityRulesObjects(int fromEligibilityID, int toEligibilityID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"WKSFPEligibilityRules\" where \"EligibilityID\" between :fromEligibilityID and :toEligibilityID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromEligibilityID", "WKSFPEligibilityRules.EligibilityID", QueryObject.PARAM_INT, new Integer(fromEligibilityID));
        query.addParameter("toEligibilityID", "WKSFPEligibilityRules.EligibilityID", QueryObject.PARAM_INT, new Integer(toEligibilityID));
        query.setResultClass(WKSFPEligibilityRules.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.WKSFPEligibilityRules> getWKSFPEligibilityRulesObjects(int fromEligibilityID, int toEligibilityID)
    {
        String queryText = "select * from \"WKSFPEligibilityRules\" where \"EligibilityID\" between :fromEligibilityID and :toEligibilityID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromEligibilityID", "WKSFPEligibilityRules.EligibilityID", QueryObject.PARAM_INT, new Integer(fromEligibilityID));
        query.addParameter("toEligibilityID", "WKSFPEligibilityRules.EligibilityID", QueryObject.PARAM_INT, new Integer(toEligibilityID));
        query.setResultClass(WKSFPEligibilityRules.class);
        return query.getObjects();
    }

}
