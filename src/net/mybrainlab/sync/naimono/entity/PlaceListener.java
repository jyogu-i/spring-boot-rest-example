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
public class PlaceListener implements EntityListener<Place> {

    @Override
    public void preInsert(Place entity, PreInsertContext<Place> context) {
    }

    @Override
    public void preUpdate(Place entity, PreUpdateContext<Place> context) {
    }

    @Override
    public void preDelete(Place entity, PreDeleteContext<Place> context) {
    }

    @Override
    public void postInsert(Place entity, PostInsertContext<Place> context) {
    }

    @Override
    public void postUpdate(Place entity, PostUpdateContext<Place> context) {
    }

    @Override
    public void postDelete(Place entity, PostDeleteContext<Place> context) {
    }
}