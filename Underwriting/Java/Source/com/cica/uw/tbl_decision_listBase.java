/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class tbl_decision_listBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_Decision_Identifier = "Decision_Identifier";
    public final static String ATTR_Decision_Value = "Decision_Value";
    public final static String ATTR_Source_Identifier = "Source_Identifier";
    public final static String ATTR_Source_Value = "Source_Value";
    public final static String ATTR_Reason_Identifier = "Reason_Identifier";
    public final static String ATTR_Reason_Value = "Reason_Value";
    public final static String ATTR_Product_Specific = "Product_Specific";
    public final static String ATTR_Issue_State_Specific = "Issue_State_Specific";
    public final static String ATTR_Medical_Specific_Decline_Reason_CA_FL_TX = "Medical_Specific_Decline_Reason_CA_FL_TX";
    public final static String ATTR_Dropdown = "Dropdown";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_decision_list.class);
            s_classInfo.setTableName("tbl_decision_list");
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Decision_Identifier);
                ai.setJavaName(ATTR_Decision_Identifier);
                ai.setColumnName(ATTR_Decision_Identifier);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Decision_Identifier);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Decision_Value);
                ai.setJavaName(ATTR_Decision_Value);
                ai.setColumnName(ATTR_Decision_Value);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Decision_Value);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Source_Identifier);
                ai.setJavaName(ATTR_Source_Identifier);
                ai.setColumnName(ATTR_Source_Identifier);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Source_Identifier);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Source_Value);
                ai.setJavaName(ATTR_Source_Value);
                ai.setColumnName(ATTR_Source_Value);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Source_Value);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Reason_Identifier);
                ai.setJavaName(ATTR_Reason_Identifier);
                ai.setColumnName(ATTR_Reason_Identifier);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Reason_Identifier);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Reason_Value);
                ai.setJavaName(ATTR_Reason_Value);
                ai.setColumnName(ATTR_Reason_Value);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Reason_Value);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Product_Specific);
                ai.setJavaName(ATTR_Product_Specific);
                ai.setColumnName(ATTR_Product_Specific);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Product_Specific);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Issue_State_Specific);
                ai.setJavaName(ATTR_Issue_State_Specific);
                ai.setColumnName(ATTR_Issue_State_Specific);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Issue_State_Specific);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Medical_Specific_Decline_Reason_CA_FL_TX);
                ai.setJavaName(ATTR_Medical_Specific_Decline_Reason_CA_FL_TX);
                ai.setColumnName(ATTR_Medical_Specific_Decline_Reason_CA_FL_TX);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Medical_Specific_Decline_Reason_CA_FL_TX);
                v.setMaxLength(1);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Dropdown);
                ai.setJavaName(ATTR_Dropdown);
                ai.setColumnName(ATTR_Dropdown);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Dropdown);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public tbl_decision_listBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getDecision_Identifier()
    {
        return getStringProperty(ATTR_Decision_Identifier);
    }

    public void setDecision_Identifier(String value)
    {
        setProperty(ATTR_Decision_Identifier, value, 0);
    }

    public String getDecision_Value()
    {
        return getStringProperty(ATTR_Decision_Value);
    }

    public void setDecision_Value(String value)
    {
        setProperty(ATTR_Decision_Value, value, 0);
    }

    public String getSource_Identifier()
    {
        return getStringProperty(ATTR_Source_Identifier);
    }

    public void setSource_Identifier(String value)
    {
        setProperty(ATTR_Source_Identifier, value, 0);
    }

    public String getSource_Value()
    {
        return getStringProperty(ATTR_Source_Value);
    }

    public void setSource_Value(String value)
    {
        setProperty(ATTR_Source_Value, value, 0);
    }

    public String getReason_Identifier()
    {
        return getStringProperty(ATTR_Reason_Identifier);
    }

    public void setReason_Identifier(String value)
    {
        setProperty(ATTR_Reason_Identifier, value, 0);
    }

    public String getReason_Value()
    {
        return getStringProperty(ATTR_Reason_Value);
    }

    public void setReason_Value(String value)
    {
        setProperty(ATTR_Reason_Value, value, 0);
    }

    public String getProduct_Specific()
    {
        return getStringProperty(ATTR_Product_Specific);
    }

    public void setProduct_Specific(String value)
    {
        setProperty(ATTR_Product_Specific, value, 0);
    }

    public String getIssue_State_Specific()
    {
        return getStringProperty(ATTR_Issue_State_Specific);
    }

    public void setIssue_State_Specific(String value)
    {
        setProperty(ATTR_Issue_State_Specific, value, 0);
    }

    public String getMedical_Specific_Decline_Reason_CA_FL_TX()
    {
        return getStringProperty(ATTR_Medical_Specific_Decline_Reason_CA_FL_TX);
    }

    public void setMedical_Specific_Decline_Reason_CA_FL_TX(String value)
    {
        setProperty(ATTR_Medical_Specific_Decline_Reason_CA_FL_TX, value, 0);
    }

    public String getDropdown()
    {
        return getStringProperty(ATTR_Dropdown);
    }

    public void setDropdown(String value)
    {
        setProperty(ATTR_Dropdown, value, 0);
    }




    public static BusObjectIterator<com.cica.uw.tbl_decision_list> getTbl_decision_listObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_decision_list\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_decision_list.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_decision_list> getTbl_decision_listObjects()
    {
        String queryText = "select * from \"tbl_decision_list\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_decision_list.class);
        return query.getObjects();
    }

}
