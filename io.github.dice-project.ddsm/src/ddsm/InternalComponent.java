/**
 */
package ddsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ddsm.InternalComponent#getRequiredport <em>Requiredport</em>}</li>
 *   <li>{@link ddsm.InternalComponent#getRequiredexecutionplatform <em>Requiredexecutionplatform</em>}</li>
 * </ul>
 *
 * @see ddsm.DdsmPackage#getInternalComponent()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='Inherit from MODACloudsML, this represents a component that is managed by the application provider,\nor the developer (e.g. a Big Data application).'"
 * @generated
 */
public interface InternalComponent extends Component {
    /**
     * Returns the value of the '<em><b>Requiredport</b></em>' containment reference list.
     * The list contents are of type {@link ddsm.RequiredPort}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requiredport</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requiredport</em>' containment reference list.
     * @see ddsm.DdsmPackage#getInternalComponent_Requiredport()
     * @model containment="true"
     * @generated
     */
    EList<RequiredPort> getRequiredport();

    /**
     * Returns the value of the '<em><b>Requiredexecutionplatform</b></em>' containment reference list.
     * The list contents are of type {@link ddsm.RequiredExecutionPlatform}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requiredexecutionplatform</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requiredexecutionplatform</em>' containment reference list.
     * @see ddsm.DdsmPackage#getInternalComponent_Requiredexecutionplatform()
     * @model containment="true"
     * @generated
     */
    EList<RequiredExecutionPlatform> getRequiredexecutionplatform();

} // InternalComponent
