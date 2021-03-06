package io.quarkus.mongodb.panache.kotlin.reactive

import io.quarkus.mongodb.panache.kotlin.reactive.runtime.KotlinReactiveMongoOperations.Companion.INSTANCE
import io.smallrye.mutiny.Uni

/**
 * Represents an entity. If your Mongo entities extend this class they gain auto-generated accessors
 * to all their public fields, as well as a lot of useful
 * methods. Unless you have a custom ID strategy, you should not extend this class directly but extend
 * [ReactivePanacheMongoEntity] instead.
 *
 * @see ReactivePanacheMongoEntity
 */
abstract class ReactivePanacheMongoEntityBase {
    /**
     * Persist this entity in the database.
     * This will set it's ID field if not already set.
     *
     * @see .persist
     * @see .persist
     * @see .persist
     */
    fun persist(): Uni<Void> = INSTANCE.persist(this)

    /**
     * Update this entity in the database.
     *
     * @see .update
     * @see .update
     * @see .update
     */
    fun update(): Uni<Void> = INSTANCE.update(this)

    /**
     * Persist this entity in the database or update it if it already exist.
     *
     * @see .persistOrUpdate
     * @see .persistOrUpdate
     * @see .persistOrUpdate
     */
    fun persistOrUpdate(): Uni<Void> = INSTANCE.persistOrUpdate(this)

    /**
     * Delete this entity from the database, if it is already persisted.
     *
     * @see .delete
     * @see .delete
     * @see .delete
     * @see .deleteAll
     */
    fun delete(): Uni<Void> = INSTANCE.delete(this)
}