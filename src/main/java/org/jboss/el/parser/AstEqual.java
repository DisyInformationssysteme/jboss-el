/* Generated By:JJTree: Do not edit this line. AstEqual.java */

package org.jboss.el.parser;

import jakarta.el.ELException;

import org.jboss.el.lang.EvaluationContext;


/**
 * @author Jacob Hookom [jacob@hookom.net]
 * @version $Change: 181177 $$DateTime: 2001/06/26 08:45:09 $$Author: markt $
 */
public final class AstEqual extends BooleanNode {
    public AstEqual(int id) {
        super(id);
    }

    public Object getValue(EvaluationContext ctx)
            throws ELException {
        Object obj0 = this.children[0].getValue(ctx);
        Object obj1 = this.children[1].getValue(ctx);
        return Boolean.valueOf(equals(obj0, obj1));
    }
}
