package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class CaResultJobCategoryListener implements EntityListener<CaResultJobCategory> {

    @Override
    public void preInsert(CaResultJobCategory entity, PreInsertContext<CaResultJobCategory> context) {
    }

    @Override
    public void preUpdate(CaResultJobCategory entity, PreUpdateContext<CaResultJobCategory> context) {
    }

    @Override
    public void preDelete(CaResultJobCategory entity, PreDeleteContext<CaResultJobCategory> context) {
    }

    @Override
    public void postInsert(CaResultJobCategory entity, PostInsertContext<CaResultJobCategory> context) {
    }

    @Override
    public void postUpdate(CaResultJobCategory entity, PostUpdateContext<CaResultJobCategory> context) {
    }

    @Override
    public void postDelete(CaResultJobCategory entity, PostDeleteContext<CaResultJobCategory> context) {
    }
}