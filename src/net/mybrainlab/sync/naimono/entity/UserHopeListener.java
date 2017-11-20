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
public class UserHopeListener implements EntityListener<UserHope> {

    @Override
    public void preInsert(UserHope entity, PreInsertContext<UserHope> context) {
    }

    @Override
    public void preUpdate(UserHope entity, PreUpdateContext<UserHope> context) {
    }

    @Override
    public void preDelete(UserHope entity, PreDeleteContext<UserHope> context) {
    }

    @Override
    public void postInsert(UserHope entity, PostInsertContext<UserHope> context) {
    }

    @Override
    public void postUpdate(UserHope entity, PostUpdateContext<UserHope> context) {
    }

    @Override
    public void postDelete(UserHope entity, PostDeleteContext<UserHope> context) {
    }
}