import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RechercheMediaComponent } from './recherche-media.component';

describe('RechercheMediaComponent', () => {
  let component: RechercheMediaComponent;
  let fixture: ComponentFixture<RechercheMediaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RechercheMediaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RechercheMediaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
