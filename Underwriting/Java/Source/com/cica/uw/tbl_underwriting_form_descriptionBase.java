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


public abstract class tbl_underwriting_form_descriptionBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_FormNumber = "FormNumber";
    public final static String ATTR_Product = "Product";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_underwriting_form_description.class);
            s_classInfo.setTableName("tbl_underwriting_form_description");
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_FormNumber);
                ai.setJavaName(ATTR_FormNumber);
                ai.setColumnName(ATTR_FormNumber);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_FormNumber);
                v.setMaxLength(15);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Product);
                ai.setJavaName(ATTR_Product);
                ai.setColumnName(ATTR_Product);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Product);
                v.setMaxLength(15);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public tbl_underwriting_form_descriptionBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getFormNumber()
    {
        return getStringProperty(ATTR_FormNumber);
    }

    public void setFormNumber(String value)
    {
        setProperty(ATTR_FormNumber, value, 0);
    }

    public String getProduct()
    {
        return getStringProperty(ATTR_Product);
    }

    public void setProduct(String value)
    {
        setProperty(ATTR_Product, value, 0);
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_form_description> GetProductDetailsForFormNumber(String formNumber)
    {
        String queryText = "select * from \"tbl_underwriting_form_description\" where \"FormNumber\" = :formNumber";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("formNumber", "tbl_underwriting_form_description.FormNumber", QueryObject.PARAM_STRING, formNumber);//NOPMD
        query.setResultClass(tbl_underwriting_form_description.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_form_description> getTbl_underwriting_form_descriptionObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_form_description\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_underwriting_form_description.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_form_description> getTbl_underwriting_form_descriptionObjects()
    {
        String queryText = "select * from \"tbl_underwriting_form_description\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_underwriting_form_description.class);
        return query.getObjects();
    }

}
