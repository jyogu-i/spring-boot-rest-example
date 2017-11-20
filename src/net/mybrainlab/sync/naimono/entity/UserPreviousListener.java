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
public class UserPreviousListener implements EntityListener<UserPrevious> {

    @Override
    public void preInsert(UserPrevious entity, PreInsertContext<UserPrevious> context) {
    }

    @Override
    public void preUpdate(UserPrevious entity, PreUpdateContext<UserPrevious> context) {
    }

    @Override
    public void preDelete(UserPrevious entity, PreDeleteContext<UserPrevious> context) {
    }

    @Override
    public void postInsert(UserPrevious entity, PostInsertContext<UserPrevious> context) {
    }

    @Override
    public void postUpdate(UserPrevious entity, PostUpdateContext<UserPrevious> context) {
    }

    @Override
    public void postDelete(UserPrevious entity, PostDeleteContext<UserPrevious> context) {
    }
}